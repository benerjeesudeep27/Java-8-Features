package com.java8.features.revision.methodref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player {
	private String firstName = null;
	private String lastName = null;
	private String position = null;
	private int status = -1;
	private int goals;

	public Player() {
	}

	public Player(String position, int status) {
		this.position = position;
		this.status = status;
	}

	protected String playerStatus() {
		String returnValue = null;
		switch (getStatus()) {
		case 0:
			returnValue = "ACTIVE";
		case 1:
			returnValue = "INACTIVE";
		case 2:
			returnValue = "INJURY";
		default:
			returnValue = "ON_BENCH";
		}
		return returnValue;
	}

	public String playerString() {
		return getFirstName() + " " + getLastName() + " - " + getPosition();
	}

	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

}

public class WorkBookExample {
	static List<Player> team;

	private static void loadTeam() {
		System.out.println("Loading team...");
		team = new ArrayList();
		System.out.println("1.******************");
		Player player1 = new Player();
		player1.setFirstName("Som");
		player1.setLastName("Rai");
		player1.setGoals(5);
		System.out.println("2.******************");
		Player player2 = new Player();
		player2.setFirstName("Prakash");
		player2.setLastName("Rai");
		player2.setGoals(15);
		System.out.println("3.******************");
		Player player3 = new Player();
		player3.setFirstName("Manish");
		player3.setLastName("ahuja");
		player3.setGoals(1);
		System.out.println("4.******************");
		Player player4 = new Player();
		player4.setFirstName("Rai");
		player4.setLastName("Prakash");
		player4.setGoals(18);
		System.out.println("5.******************");
		Player player5 = new Player();
		player5.setFirstName("Ramesh");
		player5.setLastName("pandey");
		player5.setGoals(7);
		team.add(player1);
		team.add(player2);
		team.add(player3);
		team.add(player4);
		team.add(player5);
	}

	public static void main(String[] args) {
		// Load team list
		loadTeam();
		Comparator<Player> byGoals = Comparator.comparing(Player::getGoals);
		System.out.println("== Sort by Number of Goals ==");
		team.stream().sorted(byGoals).map(p -> p.getFirstName() + " " + p.getLastName() + " - " + p.getGoals())
				.forEach(element -> System.out.println(element));
		System.out.println("== Sort by Last Name ==\n");
		Collections.sort(team, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		team.stream().forEach((p) -> {
			System.out.println(p.getLastName());
		});
	}
}
