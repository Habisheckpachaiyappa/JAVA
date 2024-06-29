import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class HangmanGame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    public HangmanGame() {
        setTitle("Hangman Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu gameMenu = new JMenu("Game");
        menuBar.add(gameMenu);

        JMenuItem newGameItem = new JMenuItem("New Game");
        gameMenu.add(newGameItem);

        JMenuItem highScoreItem = new JMenuItem("High Score");
        gameMenu.add(highScoreItem);

        JMenuItem userGuideItem = new JMenuItem("User Guide");
        gameMenu.add(userGuideItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        gameMenu.add(quitItem);

        // Set up main panel with CardLayout
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(new MainMenuPanel(), "MainMenu");
        mainPanel.add(new GamePanel(), "Game");
        mainPanel.add(new HighScorePanel(), "HighScore");
        mainPanel.add(new UserGuidePanel(), "UserGuide");

        add(mainPanel);

        // Add action listeners
        newGameItem.addActionListener(e -> cardLayout.show(mainPanel, "Game"));
        highScoreItem.addActionListener(e -> cardLayout.show(mainPanel, "HighScore"));
        userGuideItem.addActionListener(e -> cardLayout.show(mainPanel, "UserGuide"));
        quitItem.addActionListener(e -> System.exit(0));

        cardLayout.show(mainPanel, "MainMenu");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HangmanGame frame = new HangmanGame();
            frame.setVisible(true);
        });
    }
}

class MainMenuPanel extends JPanel {
    public MainMenuPanel() {
        setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to Hangman!", SwingConstants.CENTER);
        add(welcomeLabel, BorderLayout.CENTER);
    }
}

class GamePanel extends JPanel {

    private String[] words = {"PROGRAMMING", "JAVA", "SWING", "COMPUTER"};
    private String currentWord;
    private JLabel wordLabel;
    private JLabel messageLabel;
    private JTextField guessField;
    private JButton guessButton;

    public GamePanel() {
        setLayout(new BorderLayout());
        wordLabel = new JLabel("", SwingConstants.CENTER);
        wordLabel.setFont(new Font("Serif", Font.BOLD, 24));
        add(wordLabel, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        guessField = new JTextField(5);
        guessButton = new JButton("Guess");
        inputPanel.add(new JLabel("Enter your guess: "));
        inputPanel.add(guessField);
        inputPanel.add(guessButton);
        add(inputPanel, BorderLayout.SOUTH);

        messageLabel = new JLabel("", SwingConstants.CENTER);
        add(messageLabel, BorderLayout.NORTH);

        startNewGame();

        guessButton.addActionListener(new GuessHandler());
    }

    private void startNewGame() {
        Random rand = new Random();
        currentWord = words[rand.nextInt(words.length)];
        StringBuilder hiddenWord = new StringBuilder(currentWord.length());
        for (int i = 0; i < currentWord.length(); i++) {
            hiddenWord.append("_");
        }
        wordLabel.setText(hiddenWord.toString());
        messageLabel.setText("Good luck!");
    }

    private class GuessHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String guess = guessField.getText().toUpperCase();
            guessField.setText("");

            if (guess.length() == 1) {
                char guessedChar = guess.charAt(0);
                StringBuilder newWord = new StringBuilder(wordLabel.getText());

                boolean correctGuess = false;
                for (int i = 0; i < currentWord.length(); i++) {
                    if (currentWord.charAt(i) == guessedChar) {
                        newWord.setCharAt(i, guessedChar);
                        correctGuess = true;
                    }
                }

                wordLabel.setText(newWord.toString());

                if (!correctGuess) {
                    messageLabel.setText("Incorrect guess. Try again.");
                } else if (newWord.toString().equals(currentWord)) {
                    messageLabel.setText("Congratulations! You won!");
                }
            } else {
                messageLabel.setText("Please enter a single letter.");
            }
        }
    }
}

class HighScorePanel extends JPanel {
    public HighScorePanel() {
        setLayout(new BorderLayout());
        JLabel highScoreLabel = new JLabel("High Scores", SwingConstants.CENTER);
        highScoreLabel.setFont(new Font("Serif", Font.BOLD, 24));
        add(highScoreLabel, BorderLayout.NORTH);

        JTextArea highScores = new JTextArea();
        highScores.setEditable(false);
        highScores.setText("1. John Doe - 100\n2. Jane Smith - 90\n3. Bob Brown - 80");
        add(new JScrollPane(highScores), BorderLayout.CENTER);
    }
}

class UserGuidePanel extends JPanel {
    public UserGuidePanel() {
        setLayout(new BorderLayout());
        JLabel userGuideLabel = new JLabel("User Guide", SwingConstants.CENTER);
        userGuideLabel.setFont(new Font("Serif", Font.BOLD, 24));
        add(userGuideLabel, BorderLayout.NORTH);

        JTextArea userGuide = new JTextArea();
        userGuide.setEditable(false);
        userGuide.setText("Welcome to the Hangman game!\n\n" +
                "1. Click 'New Game' to start a new game.\n" +
                "2. Enter a letter in the text field and click 'Guess' to make a guess.\n" +
                "3. The game will show you which letters you guessed correctly.\n" +
                "4. Try to guess the word before you run out of attempts!\n" +
                "5. Check the 'High Score' to see the top players.\n" +
                "6. Quit the game using the 'Quit' option.");
        add(new JScrollPane(userGuide), BorderLayout.CENTER);
    }
}

