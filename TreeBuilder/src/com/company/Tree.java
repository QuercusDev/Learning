package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    Tree(double dbh, double length){
        this.dbh = dbh;
        this.length = length;
    }

    private static double dbh;
    private static double topHeight;
    private static double length;
    private static double taper;
    private static ArrayList<Double> treeDia;
    private static ArrayList<Double> treeLength;
    private static double buttDia;
    List<Double> list =


        public static void treeBuild ( ) {
            taper = (( dbh ) / length)*100;
            System.out.println("dbh"+dbh);
            System.out.println("taper"+taper);
            System.out.println("top height"+topHeight);
            buttDia = (taper * 1.3) + dbh;
            System.out.println(buttDia);
            treeDia.add(buttDia);

            for (int i = 0; i < length; i++) {
               if(i<1) {
                   treeDia.add(buttDia);
               }
               else{
                    treeDia.add(buttDia - taper);
                }

            }
        }
    }

