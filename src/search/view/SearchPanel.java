package search.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import search.controller.SearchController;

public class SearchPanel extends JPanel
{
	private SearchController baseController;
	private JButton scrambleButton;
	private JButton sortButton;
	private JButton searchButton;
	private JTextField userField;
	private JTextArea displayArea;
	private JScrollPane displayPane;
	private SpringLayout baseLayout;
	
	public SearchPanel(SearchPanelController baseController)
	{
		this.baseController = baseController;
	}
	
}
