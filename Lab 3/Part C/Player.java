/**
 * ENSF 409 - Lab 3 - Winter 2011
 * @author  Harry Han, Yida Xu
 * January 22, 2015
 */

import java.io.*;

public class Player {

	private String name;
	private Board board;
	private Player opponent;
	private char mark;
		
	public Player() {
	}
	
	public Player(String name, char mark, Board board){
		this.name = name;
		this.mark = mark;
		this.board = board;
	}
	
	public void setOpponent(Player other) {
		opponent = other;
	}
	
	public String name(){
		return name;
	}
	
	public char mark(){
		return mark;
	}
	
	

}

	class HumanPlayer extends Player{
		public HumanPlayer(){
		}
	
		public HumanPlayer(String name, char mark, Board board) {
			super(name, mark, board);
		}
	}
	
	class RandomPlayer extends HumanPlayer{
		public RandomPlayer(){
		}
	
		public RandomPlayer(String name, char mark, Board board) {
			super(name, mark, board);
		}
	}
	
	class BlockingPlayer extends RandomPlayer{
		public BlockingPlayer(){
		}
	
		public BlockingPlayer(String name, char mark, Board board) {
			super(name, mark, board);
		}
	}
	
	class SmartPlayer extends BlockingPlayer{
		public SmartPlayer(){
		}
	
		public SmartPlayer(String name, char mark, Board board) {
			super(name, mark, board);
		}
	}