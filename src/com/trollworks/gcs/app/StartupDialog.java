/*
 * Copyright (c) 1998-2014 by Richard A. Wilkes. All rights reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * version 2.0. If a copy of the MPL was not distributed with this file, You
 * can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * This Source Code Form is "Incompatible With Secondary Licenses", as defined
 * by the Mozilla Public License, version 2.0.
 */

package com.trollworks.gcs.app;

import com.trollworks.gcs.menu.data.DataMenu;
import com.trollworks.gcs.menu.file.NewCharacterSheetCommand;
import com.trollworks.gcs.menu.file.NewCharacterTemplateCommand;
import com.trollworks.gcs.menu.file.NewLibraryCommand;
import com.trollworks.toolkit.annotation.Localize;
import com.trollworks.toolkit.ui.UIUtilities;
import com.trollworks.toolkit.ui.WindowSizeEnforcer;
import com.trollworks.toolkit.ui.layout.PrecisionLayout;
import com.trollworks.toolkit.ui.menu.file.FileType;
import com.trollworks.toolkit.ui.menu.file.OpenCommand;
import com.trollworks.toolkit.ui.menu.file.RecentFilesMenu;
import com.trollworks.toolkit.ui.widget.AppWindow;
import com.trollworks.toolkit.utility.Localization;
import com.trollworks.toolkit.utility.Path;

import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/** The initial dialog user's see upon launch if no files have been specified. */
public class StartupDialog extends JDialog implements WindowFocusListener, ActionListener, MouseListener, KeyListener, ListSelectionListener {
	@Localize("Choose An Action")
	private static String	TITLE;
	@Localize("Create")
	private static String	CREATE;
	@Localize("Recent Files")
	private static String	RECENT_FILES;
	@Localize("Character Sheet")
	private static String	NEW_CHARACTER_SHEET;
	@Localize("Library")
	private static String	NEW_LIBRARY;
	@Localize("Template")
	private static String	NEW_TEMPLATE;
	@Localize("Other\u2026")
	private static String	CHOOSE_OTHER;
	@Localize("Open")
	private static String	OPEN;

	static {
		Localization.initialize();
	}

	private JButton			mSheetButton;
	private JButton			mLibraryButton;
	private JButton			mTemplateButton;
	private JButton			mChooseOtherButton;
	private JButton			mOpenButton;
	private JList<File>		mRecentFilesList;

	/** Creates a new {@link StartupDialog}. */
	public StartupDialog() {
		super(JOptionPane.getRootFrame(), TITLE, true);
		Container content = getContentPane();
		content.setLayout(new PrecisionLayout("margins:10 columns:2")); //$NON-NLS-1$
		content.add(createCreatePanel(), "vGrab:yes vAlign:fill hAlign:fill"); //$NON-NLS-1$
		content.add(createRecentFilesPanel(), "vGrab:yes hGrab:yes vAlign:fill hAlign:fill"); //$NON-NLS-1$
		setResizable(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		WindowSizeEnforcer.monitor(this);
		addWindowFocusListener(this);
		pack();
		setLocationRelativeTo(null);
	}

	private JPanel createCreatePanel() {
		JPanel panel = new JPanel(new PrecisionLayout());
		panel.setBorder(new TitledBorder(CREATE));
		mSheetButton = createButton(panel, NEW_CHARACTER_SHEET, GCSImages.getCharacterSheetIcon(true));
		mLibraryButton = createButton(panel, NEW_LIBRARY, GCSImages.getLibraryIcon(true));
		mTemplateButton = createButton(panel, NEW_TEMPLATE, GCSImages.getTemplateIcon(true));
		UIUtilities.adjustToSameSize(panel.getComponents());
		return panel;
	}

	private JPanel createRecentFilesPanel() {
		JPanel panel = new JPanel(new PrecisionLayout("columns:2 equalColumns:yes")); //$NON-NLS-1$
		panel.setBorder(new TitledBorder(RECENT_FILES));
		mRecentFilesList = new JList<>(RecentFilesMenu.getRecents().toArray(new File[0]));
		mRecentFilesList.setCellRenderer(new DefaultListCellRenderer() {
			@Override
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
				super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				setText(DataMenu.filterTitle(Path.getLeafName(((File) value).getName(), false)));
				setIcon(new ImageIcon(FileType.getIconForFile((File) value)));
				return this;
			}
		});
		mRecentFilesList.setSize(mRecentFilesList.getPreferredSize());
		mRecentFilesList.addMouseListener(this);
		mRecentFilesList.addKeyListener(this);
		JScrollPane scrollPane = new JScrollPane(mRecentFilesList);
		scrollPane.setMinimumSize(new Dimension(150, 75));
		panel.add(scrollPane, "hSpan:2 vGrab:yes hGrab:yes vAlign:fill hAlign:fill"); //$NON-NLS-1$
		mChooseOtherButton = new JButton(CHOOSE_OTHER);
		mChooseOtherButton.addActionListener(this);
		panel.add(mChooseOtherButton, "hAlign:middle"); //$NON-NLS-1$
		mOpenButton = new JButton(OPEN);
		mOpenButton.setEnabled(false);
		mOpenButton.addActionListener(this);
		mOpenButton.setDefaultCapable(true);
		getRootPane().setDefaultButton(mOpenButton);
		mRecentFilesList.addListSelectionListener(this);
		panel.add(mOpenButton, "hAlign:middle"); //$NON-NLS-1$
		UIUtilities.adjustToSameSize(mChooseOtherButton, mOpenButton);
		return panel;
	}

	private JButton createButton(Container panel, String title, BufferedImage image) {
		JButton button = new JButton(title, new ImageIcon(image));
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setVerticalTextPosition(SwingConstants.BOTTOM);
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.addActionListener(this);
		panel.add(button);
		return button;
	}

	@Override
	public void windowGainedFocus(WindowEvent event) {
		mRecentFilesList.requestFocus();
		removeWindowFocusListener(this);
	}

	@Override
	public void windowLostFocus(WindowEvent event) {
		// Not used.
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object obj = event.getSource();
		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		if (obj == mSheetButton) {
			NewCharacterSheetCommand.newSheet();
		} else if (obj == mLibraryButton) {
			NewLibraryCommand.newLibrary();
		} else if (obj == mTemplateButton) {
			NewCharacterTemplateCommand.newTemplate();
		} else if (obj == mChooseOtherButton) {
			OpenCommand.open();
		} else if (obj == mOpenButton) {
			openSelectedRecents(false);
		}
		if (AppWindow.getAllWindows().isEmpty()) {
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		} else {
			dispose();
		}
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		if (event.getClickCount() > 1 && mRecentFilesList.locationToIndex(event.getPoint()) != -1) {
			openSelectedRecents(true);
		}
	}

	private void openSelectedRecents(boolean performPostAmble) {
		setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		for (File obj : mRecentFilesList.getSelectedValuesList()) {
			OpenCommand.open(obj);
		}
		if (performPostAmble) {
			if (AppWindow.getAllWindows().isEmpty()) {
				setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			} else {
				dispose();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent event) {
		// Not used.
	}

	@Override
	public void mouseExited(MouseEvent event) {
		// Not used.
	}

	@Override
	public void mousePressed(MouseEvent event) {
		// Not used.
	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// Not used.
	}

	@Override
	public void keyPressed(KeyEvent event) {
		char key = event.getKeyChar();
		if (key == '\n' || key == '\r') {
			openSelectedRecents(true);
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// Not used.
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// Not used.
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {
		mOpenButton.setEnabled(!mRecentFilesList.isSelectionEmpty());
	}
}