package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("Witaj w grze w64164, co chcesz zrobić?");
			System.out.println("1.Graj");
			System.out.println("2.Sterowanie");
			System.out.println("3.Wyjście");
			int wybor = 0;
			wybor = scanner.nextInt();
			switch (wybor) {
				case 1:
					JFrame jf = new JFrame("w64164");
					jf.setBounds(0,0,1200,750);
					jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					jf.setResizable(false);
					jf.setVisible(true);
					Gra gra = new Gra();
					jf.add(gra);
				case 2:
					System.out.println("Sterowanie:");
					System.out.println("W oraz S urzywamy do przemiszczania się do przodu oraz tyłu");
					System.out.println("A oraz D do kolejo w prawo oraz w lewo");
					System.out.println("Spacją strzelamy i zdobywamy punkty (możliwe jest również taranownie");
					System.out.println("Nacisnij ESC aby zatrzymać oraz wznowić grę (tu to możliwe ;) )");
					System.out.println("Powodzenia!");
					break;
				case 3:
					System.out.println("Do zobaczenia i miłego dnia!");
					return;
				default:
					System.out.println("Wybierz liczbę od 1 do 3");

			}
		}
	}
}
