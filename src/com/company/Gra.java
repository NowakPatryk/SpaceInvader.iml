package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class Gra extends JPanel implements KeyListener, ActionListener {
    public int pauzaMode(int pauza)
    {
        if(pauza == 1)
        {
            System.out.println("Pauza");
        }
        else{
            System.out.println("Start");
        }
        return pauza;
    }
    private int x = 550, y = 615;
    private int  xShoot = x, yShoot = y;
    private int shootSpeed = 35, makeShoot = 0;
    private Timer time;
    //odleglosc poruszania
    private int speed = 15, speedy = 10;
    private int ex = 10 ,ey = 10;
    //private Random liczba = new Random();
    //private int wrogX1 = liczba.nextInt(6)*100;
    //private int wrogX2 = liczba.nextInt(6)*100;
    //private int wgpoz = 100;
    private int enemyY = 0;
    private int w1 = 0, w2 = 0, w3 = 0, w4 = 0, w5 = 0, w6 = 0, w7 = 0, w8 = 0, w9 = 0, w10 = 0, w11 = 0, w12 = 0,
            w13 = 0, w14 = 0, w15 = 0, w16 = 0, w17 = 0, w18 = 0;
    private int shootMarker1 = 0,shootMarker2 = 0,shootMarker3 = 0,shootMarker4 = 0,shootMarker5 = 0,shootMarker6 = 0, shootMarker7 = 0,shootMarker8 = 0,
            shootMarker9 = 0,shootMarker10 = 0, shootMarker11 = 0,shootMarker12 = 0,shootMarker13 = 0,shootMarker14 = 0, shootMarker15 = 0,shootMarker16 = 0,
            shootMarker17 = 0,shootMarker18 = 0;
    private int points = 0, esc = 0;


    public Gra(){

        //Odświerzanie
        time = new Timer(10, this);
        time.start();

        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
    }
    public void paint(Graphics g){

        //Kolor tła
        g.setColor(Color.BLACK);
        g.fillRect(0,0,1200,750);
        //Gracz
        g.setColor(Color.CYAN);
        g.fillRect(x,y, 75 ,75);
        //Wróg
        g.setColor(Color.RED);
        //for(int i = 1; i > 20; i++)
        //{
        //    wgpoz = i * 100;
        //    g.fillRect(wgpoz, ey, 75 ,75);
        //}
        //dodawnie przeciwników
        g.fillRect(enemyY + 100, w1 + ey , 75 ,75);
        g.fillRect(enemyY + 200, w2 + ey, 75 ,75);
        g.fillRect(enemyY + 300, w3 + ey, 75 ,75);
        g.fillRect(enemyY + 400, w4 + ey, 75 ,75);
        g.fillRect(enemyY + 500, w5 + ey, 75 ,75);
        g.fillRect(enemyY + 600, w6 + ey, 75 ,75);
        g.fillRect(enemyY + 700, w7 + ey, 75 ,75);
        g.fillRect(enemyY + 800, w8 + ey, 75 ,75);
        g.fillRect(enemyY + 900, w9 + ey, 75 ,75);
        g.fillRect(enemyY + 1000,w10 +  ey, 75 ,75);
        g.fillRect(enemyY + 200, w11 + ey + 100, 75 ,75);
        g.fillRect(enemyY + 300, w12 + ey + 100, 75 ,75);
        g.fillRect(enemyY + 400, w13 + ey + 100, 75 ,75);
        g.fillRect(enemyY + 500, w14 + ey + 100, 75 ,75);
        g.fillRect(enemyY + 600, w15 + ey + 100, 75 ,75);
        g.fillRect(enemyY + 700, w16 + ey + 100, 75 ,75);
        g.fillRect(enemyY + 800, w17 + ey + 100, 75 ,75);
        g.fillRect(enemyY + 900, w18 + ey + 100, 75 ,75);
        g.setColor(Color.GREEN);
        g.fillRect(xShoot,yShoot , 10 ,35);
        //Punkty
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif", Font.BOLD, 20));
        g.drawString("Punkty: " + points, 1087, 20);
        g.setColor(Color.WHITE);
        g.setFont(new Font("serif", Font.BOLD, 20));
        g.drawString("Punkty: " + points, 1087, 20);
        //Poziomy
        //g.setColor(Color.WHITE);
        //g.setFont(new Font("serif", Font.BOLD, 20));
        //g.drawString("Poziom: " + level, 1090, 40);


        // g.setColor(Color.WHITE);
        //g.setFont(new Font("serif", Font.BOLD, 20));
        //g.drawString("Punkty: " + punkty, 570, 20);


    }




    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        //ruch przeciwników
        //strzelanie
        if (makeShoot == 1)
        {
            yShoot -= shootSpeed;
            //System.out.println(yShoot);
            if (yShoot < -15)
            {
                yShoot = y;
                makeShoot = 0;
            }
        }

        //resetowanie poziomu
        if (points % 18 == 0)
        {
            w1 = 0; w2 = 0; w3 = 0; w4 = 0; w5 = 0; w6 = 0; w7 = 0; w8 = 0; w9 = 0; w10 = 0; w11 = 0; w12 = 0;
            w13 = 0; w14 = 0; w15 = 0; w16 = 0; w17 = 0; w18 = 0;
            shootMarker1 = 0;shootMarker2 = 0;shootMarker3 = 0;shootMarker4 = 0;shootMarker5 = 0;shootMarker6 = 0; shootMarker7 = 0;shootMarker8 = 0;
            shootMarker9 = 0;shootMarker10 = 0; shootMarker11 = 0;shootMarker12 = 0;shootMarker13 = 0;shootMarker14 = 0; shootMarker15 = 0;shootMarker16 = 0;
            shootMarker17 = 0;shootMarker18 = 0;
        }
        //system spadania
        //if(ey == 580)
        //{
        //    ey = 10;
        //    wrogX1 = liczba.nextInt(6)*100;
        //    wrogX2 = liczba.nextInt(6)*100;
        //    punkty++;
        //    System.out.println(punkty);
        //}
        Rectangle gracz = new Rectangle(x,y, 75,75);
        Rectangle wrgo1 = new Rectangle(enemyY + 100, ey , 75, 75);
        Rectangle wrgo2 = new Rectangle(enemyY + 200, ey , 75, 75);
        Rectangle wrgo3 = new Rectangle(enemyY + 300, ey, 75, 75);
        Rectangle wrgo4 = new Rectangle(enemyY + 400, ey, 75, 75);
        Rectangle wrgo5 = new Rectangle(enemyY + 500, ey, 75, 75);
        Rectangle wrgo6 = new Rectangle(enemyY + 600, ey, 75, 75);
        Rectangle wrgo7 = new Rectangle(enemyY + 700, ey, 75, 75);
        Rectangle wrgo8 = new Rectangle(enemyY + 800, ey, 75, 75);
        Rectangle wrgo9 = new Rectangle(enemyY + 900, ey, 75, 75);
        Rectangle wrgo10 = new Rectangle(enemyY + 1000, ey, 75, 75);
        Rectangle wrgo11 = new Rectangle(enemyY + 200, ey + 100, 75, 75);
        Rectangle wrgo12 = new Rectangle(enemyY + 300, ey + 100, 75, 75);
        Rectangle wrgo13 = new Rectangle(enemyY + 400, ey + 100, 75, 75);
        Rectangle wrgo14 = new Rectangle(enemyY + 500, ey + 100, 75, 75);
        Rectangle wrgo15 = new Rectangle(enemyY + 600, ey + 100, 75, 75);
        Rectangle wrgo16 = new Rectangle(enemyY + 700, ey + 100, 75, 75);
        Rectangle wrgo17 = new Rectangle(enemyY + 800, ey + 100, 75, 75);
        Rectangle wrgo18 = new Rectangle(enemyY + 900, ey + 100, 75, 75);

        Rectangle gun = new Rectangle(xShoot,yShoot , 10 ,35);



        if(gracz.intersects(wrgo1) || (gun.intersects(wrgo1))){
            w1 = 1300;
            if(shootMarker1 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker1 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo2) || (gun.intersects(wrgo2))){
            w2 = 1300;
            if(shootMarker2 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker2 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo3) || (gun.intersects(wrgo3))){
            w3 = 1300;
            if(shootMarker3 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker3 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo4) || (gun.intersects(wrgo4))){
            w4 = 1300;
            if(shootMarker4 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker4 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo5) || (gun.intersects(wrgo5))){
            w5 = 1300;
            if(shootMarker5 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker5 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo6) || (gun.intersects(wrgo6))){
            w6 = 1300;
            if(shootMarker6 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker6 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo7) || (gun.intersects(wrgo7))){
            w7 = 1300;
            if(shootMarker7 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker7 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo8) || (gun.intersects(wrgo8))){
            w8 = 1300;
            if(shootMarker8 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker8 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo9) || (gun.intersects(wrgo9))){
            w9 = 1300;
            if(shootMarker9 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker9 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo10) || (gun.intersects(wrgo10))){
            w10 = 800;
            if(shootMarker10 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker10 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo11) || (gun.intersects(wrgo11))){
            w11 = 800;
            if(shootMarker11 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker11 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo12) || (gun.intersects(wrgo12))){
            w12 = 800;
            if(shootMarker12 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker12 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo13) || (gun.intersects(wrgo13))){
            w13 = 800;
            if(shootMarker13 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker13 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo14) || (gun.intersects(wrgo14))){
            w14 = 800;
            if(shootMarker14 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker14 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo15) || (gun.intersects(wrgo15))){
            w15 = 800;
            if(shootMarker15 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker15 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo16) || (gun.intersects(wrgo16))){
            w16 = 800;
            if(shootMarker16 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker16 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo17) || (gun.intersects(wrgo17))){
            w17 = 800;
            if(shootMarker17 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker17 = 1;
                points++;
            }
        }
        if(gracz.intersects(wrgo18) || (gun.intersects(wrgo18))){
            w18 = 800;
            if(shootMarker18 == 0)
            {
                yShoot = y;
                makeShoot = 0;
                shootMarker18 = 1;
                points++;
            }
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            if(esc == 0)
            {
                esc = 1;
                time.stop();
                pauzaMode(esc);
            } else
            {
                esc = 0;
                time.start();
                pauzaMode(esc);
            }

        }
        if(e.getKeyCode() == KeyEvent.VK_A){
            if(x == 30) {
                x = 30;
            } else
            {
                x -= speed;
                xShoot = x;
                //System.out.println(x);
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            if(x == 1070) {
                x = 1070;
            } else
            {
                x += speed;
                xShoot = x;
                //System.out.println(x);
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_S){
            if(y == 625) {
                y = 625;
            } else
            {
                y += speedy;
                yShoot = y;
                //System.out.println(y);
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_W){
            if(y == 5) {
                y = 5;
            } else
            {
                y -= speedy;
                yShoot = y;
                //System.out.println(y);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
            makeShoot = 1;
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            reset();
        }
    }

    private void reset() {


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}