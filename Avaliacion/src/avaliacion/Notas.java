package avaliacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Notas {

    private static int alumno = 901;
    private float notaTeorica;
    private float notaPractica;
    private float notaTrabajo;
    private float notaMedia;

    public float pedirNotaTeorica() {
        float notaT;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("teclea nota");
            notaT = sc.nextFloat();
        } while (notaT < 1 || notaT > 10);
        return notaT;
    }

    public float pedirNotaPractica() {
        float notaP;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("teclea nota");
            notaP = sc.nextFloat();
        } while (notaP < 1 || notaP > 10);
        return notaP;
    }

    public float pedirNumBoletines() {
        float notaTr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("teclea número");
            notaTr = sc.nextFloat();
        } while (notaTr < 1 || notaTr > 20);
        return notaTr;
    }

//    public void calcularMedia() {
//        float notaTr;
//        int cont;
//        for (cont = 0; cont <2; cont++) {
//            notaTeorica = pedirNotaTeorica();
//            notaPractica = pedirNotaPractica();
//            notaTr = pedirNumBoletines() / 20 * 100;
//            if (notaTr >= 80) {
//                notaTrabajo = 2;
//            } else if (notaTr >= 70) {
//                notaTrabajo = 1;
//            } else {
//                notaTrabajo = 0;
//            }
//
//            notaMedia = notaTeorica * 0.4f + notaPractica * 0.4f + notaTrabajo;
//            notaMedia = Math.round(notaMedia);
//            if (notaMedia >= 5) {
//                JOptionPane.showMessageDialog(null, "APROBADO\n" + this);
//            } else {
//                JOptionPane.showMessageDialog(null, "SUSPENSO\n" + this);
//            }
//            alumno++;
//        }
//    }
    //
    public void calcularMedia() {
        float notaTr;
        do {
            notaTeorica = pedirNotaTeorica();
            notaPractica = pedirNotaPractica();
            notaTr = pedirNumBoletines() / 20 * 100;
            if (notaTr >= 80) {
                notaTrabajo = 2;
            } else if (notaTr >= 70) {
                notaTrabajo = 1;
            } else {
                notaTrabajo = 0;
            }

            notaMedia = notaTeorica * 0.4f + notaPractica * 0.4f + notaTrabajo;
            notaMedia = Math.round(notaMedia);
            if (notaMedia >= 5) {
                JOptionPane.showMessageDialog(null, "APROBADO\n" + this);
                alumno++;
            } else if (notaMedia <= 5 && notaMedia >= 2) {
                JOptionPane.showMessageDialog(null, "SUSPENSO\n" + this);
                alumno++;
            } else {
                JOptionPane.showMessageDialog(null, "SUSPENDIDISIMO\n");
                alumno++;
            }
        } while (notaMedia >= 2);
    }

    @Override
    public String toString() {
        return "Código de Alumno: " + alumno + "\nNota Teórica: " + notaTeorica + "\nNota práctica: " + notaPractica + "\nNota trabajo: " + notaTrabajo + "\nNota media: " + notaMedia;
    }
}
