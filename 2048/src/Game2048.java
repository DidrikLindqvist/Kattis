import java.util.Scanner;
/**
 * Project : Game2048
 * Class   : Game2048.java
 * Date    : ????. 2015 
 * @author : Didrik Lindqvist
 * Kattis url : https://open.kattis.com/problems/2048
 */
public class Game2048 {

    Node[][] board = new Node[4][4];
    boolean added = false;
    int move; // left(0), up(1), right(2), down(3)

    public static void main(String[] args) {
	new Game2048();
    }

    Game2048() {
	
	readBoard();
	runGame();
	printBoard();
    }

    private void runGame() {
	for (int k = 0; k < 3; k++) {
	    for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board.length; j++) {
		    switch (move) {
		    case 0: // left(0)
			moveLeft(i, j);
			break;
		    case 1: // up(1)
			moveUp(i, j);
			break;
		    case 2: // right(2)
			moveRight(i, j);
			if (added) {
			    added = false;
			    if (insideGamePlan(i, j + 1))
				j++;
			    else if (insideGamePlan(i + 1, j)) {
				i++;
			    }
			}
			break;
		    case 3: // down(3)
			moveDown(i, j);

			break;
		    default:
			break;
		    }
		}
	    }
	}

    }

    void readBoard() {
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 4; j++) {
		Node node = new Node();
		board[i][j] = node;
		board[i][j].setValue(scan.nextInt());
	    }
	}
	move = scan.nextInt();
	scan.close();
    }

    void printBoard() {
	for (int i = 0; i < 4; i++) {
	    for (int j = 0; j < 4; j++) {
		System.out.print(board[i][j].getValue() + " ");
	    }
	    System.out.println();
	}
    }

    boolean insideGamePlan(int i, int j) {
	if (i >= 0 && i < 4 && j >= 0 && j < 4)
	    return true;
	return false;
    }

    void moveUp(int i, int j) {

	if (insideGamePlan(i - 1, j)) {

	    if (board[i - 1][j].getValue() != 0) {
		Node node = board[i - 1][j];
		Node nodeOrg = board[i][j];
		if (node.getValue() == nodeOrg.getValue()
			&& !node.isBoolMerged() && !nodeOrg.isBoolMerged()) {
		    node.setValue(node.getValue() + nodeOrg.getValue());
		    node.setBoolToTrue();
		    nodeOrg.setValue(0);

		}

	    } else {

		Node node = board[i - 1][j];
		Node nodeOrg = board[i][j];
		node.setValue(nodeOrg.getValue());
		node.setBoolVale(nodeOrg.isBoolMerged());
		nodeOrg.setValue(0);
		nodeOrg.resetBool();

	    }
	}

    }

    void moveDown(int i, int j) {

	if (insideGamePlan(i + 1, j)) {

	    if (board[i + 1][j].getValue() != 0) {
		Node node = board[i + 1][j];
		Node nodeOrg = board[i][j];
		if (node.getValue() == nodeOrg.getValue()
			&& !node.isBoolMerged() && !nodeOrg.isBoolMerged()) {
		    node.setValue(node.getValue() + nodeOrg.getValue());
		    node.setBoolToTrue();
		    nodeOrg.setValue(0);

		}

	    } else {

		Node node = board[i + 1][j];
		Node nodeOrg = board[i][j];
		node.setValue(nodeOrg.getValue());
		node.setBoolVale(nodeOrg.isBoolMerged());
		nodeOrg.setValue(0);
		nodeOrg.resetBool();

	    }
	}

    }

    void moveLeft(int i, int j) {

	if (insideGamePlan(i, j - 1)) {

	    if (board[i][j - 1].getValue() != 0) {
		Node node = board[i][j - 1];
		Node nodeOrg = board[i][j];
		if (node.getValue() == nodeOrg.getValue()
			&& !node.isBoolMerged() && !nodeOrg.isBoolMerged()) {
		    node.setValue(node.getValue() + nodeOrg.getValue());
		    node.setBoolToTrue();
		    nodeOrg.setValue(0);

		}

	    } else {

		Node node = board[i][j - 1];
		Node nodeOrg = board[i][j];
		node.setValue(nodeOrg.getValue());
		node.setBoolVale(nodeOrg.isBoolMerged());
		nodeOrg.setValue(0);
		nodeOrg.resetBool();

	    }
	}

    }

    void moveRight(int i, int j) {

	if (insideGamePlan(i, j + 1)) {

	    if (board[i][j + 1].getValue() != 0) {

		Node node = board[i][j + 1];
		Node nodeOrg = board[i][j];
		if (node.getValue() == nodeOrg.getValue()
			&& !node.isBoolMerged() && !nodeOrg.isBoolMerged()) {
		    node.setValue(node.getValue() + nodeOrg.getValue());
		    node.setBoolToTrue();
		    nodeOrg.setValue(0);
		    added = true;
		}
	    } else {

		Node node = board[i][j + 1];
		Node nodeOrg = board[i][j];
		node.setValue(nodeOrg.getValue());
		node.setBoolVale(nodeOrg.isBoolMerged());
		nodeOrg.setValue(0);
		nodeOrg.resetBool();
		added = true;

	    }
	}

    }

    public class Node {
	private int value;
	private boolean merged;

	public Node() {
	    merged = false;
	}

	public int getValue() {
	    return value;
	}

	public void setBoolVale(boolean bool) {
	    merged = bool;
	}

	public void setValue(int i) {
	    value = i;
	}

	public void setBoolToTrue() {
	    merged = true;
	}

	public void resetBool() {
	    merged = false;
	}

	public Boolean isBoolMerged() {
	    return merged;
	}
    }

}
