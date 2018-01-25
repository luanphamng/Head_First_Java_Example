package chap14CardPlayer;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizCardPlayer {

	private JTextArea display;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private QuizCard currentCard;
	private int currentCardIndex;
	private JFrame frame;
	private JButton nextButton;
	private boolean isShowAnswer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizCardPlayer reader = new QuizCardPlayer();
		reader.go();
	}

	public void go() {
		// build and display gui
		frame = new JFrame("Quiz Card Player");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif", Font.BOLD, 24);

		display = new JTextArea(10, 20);
		display.setFont(bigFont);

		display.setLineWrap(true);
		display.setEditable(true);

		JScrollPane qScrollPane = new JScrollPane(display);
		qScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		nextButton = new JButton("Show Question");
		mainPanel.add(qScrollPane);
		mainPanel.add(nextButton);
		nextButton.addActionListener(new NextCardListener());

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem loadMenuItem = new JMenuItem("Load card set");
		loadMenuItem.addActionListener(new OpenMenuListener());
		fileMenu.add(loadMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.setSize(640, 500);
		frame.setVisible(true);

	}

	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			if (isShowAnswer) {
				display.setText(currentCard.getAnswer());
				nextButton.setText("Next Card");
				isShowAnswer = false;
			} else {
				if (currentCardIndex < cardList.size()) {
					showNextCard();
				} else {
					display.setText("That was last card");
					nextButton.setEnabled(false);
				}
			}
		}
	}

	public class OpenMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			JFileChooser fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame);
			loadFile(fileOpen.getSelectedFile());
		}
	}

	private void loadFile(File file) {
		cardList = new ArrayList<QuizCard>();
		try {
			BufferedReader readerx = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = readerx.readLine()) != null) {
				makeCard(line);
			}
			readerx.close();
		} catch (IOException ex) {
			System.out.println("couldn't read the card file");
			ex.printStackTrace();
		}
		showNextCard();
	}

	private void makeCard(String lineToParse) {
		String[] result = lineToParse.split("/");
		QuizCard card = new QuizCard(result[0], result[1]);
		cardList.add(card);
		System.out.println("made a card");

	}

	private void showNextCard() {
		currentCard = cardList.get(currentCardIndex);
		currentCardIndex++;
		display.setText(currentCard.getQuestion());
		nextButton.setText("Show Answer");
		isShowAnswer = true;
	}

}
