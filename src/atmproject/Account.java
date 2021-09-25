package atmproject;
    import java.text.DecimalFormat;
import java.util.Scanner;
    class Account {
        private int musteriNo;
        private int pinNo;
        private double vadesiz;
        private double vadeli;
        Scanner scan = new Scanner(System.in);
        DecimalFormat paraFormat = new DecimalFormat("'$'###,##0.00");
        public int getMusteriNo() {
            return musteriNo;
        }
        public void setMusteriNo(int musteriNo) {
            this.musteriNo = musteriNo;
        }
        public int getPinNo() {
            return pinNo;
        }
        public void setPinNo(int pinNo) {
            this.pinNo = pinNo;
        }
        public double getVadesiz() {
            return vadesiz;
        }
        public void setVadesiz(double vadesiz) {
            this.vadesiz = vadesiz;
        }
        public double getVadeli() {
            return vadeli;
        }
        public void setVadeli(double vadeli) {
            this.vadeli = vadeli;
        }
        public double paraCekVadesizden(double miktar) {
            vadesiz = vadesiz - miktar;
            return vadesiz;
        }
        public double paraYatirVadesize(double miktar) {
            vadesiz = vadesiz + miktar;
            return vadesiz;
        }
        public double paraCekVadeliden(double miktar) {
            vadeli = vadeli - miktar;
            return vadeli;
        }
        public double paraYatirVadeliye(double miktar) {
            vadeli = vadeli + miktar;
            return vadeli;
        }
        public void vadesizBakiyeParaCektiktenSonra() {
            System.out.println("Vadesiz hesap bakiyeniz: " + paraFormat.format(vadesiz));
            System.out.print("Lutfen cekmek istediginiz miktari girin: ");
            double miktar = scan.nextDouble();
            if (vadesiz >= miktar) {
                paraCekVadesizden(miktar);
                System.out.println("Cektiginiz miktar: " + miktar);
                System.out.println("Vadesiz hesap bakiyeniz: " + paraFormat.format(vadesiz));
            } else {
                System.out.println("Bakiyeniz yetersizdir.");
            }
        }
        public void vadesizBakiyeParaYatirdiktanSonra() {
            System.out.println("Vadesiz hesap bakiyeniz: " + paraFormat.format(vadesiz));
            System.out.print("Lutfen yatirmak istediginiz miktari girin: ");
            double miktar = scan.nextDouble();
            paraYatirVadesize(miktar);
            System.out.println("Vadesiz hesap bakiyeniz: " + paraFormat.format(vadesiz));
        }
        public void vadeliBakiyeParaCektiktenSonra() {
            System.out.println("Vadeli hesap bakiyeniz: " + paraFormat.format(vadeli));
            System.out.print("Lutfen cekmek istediginiz miktari girin: ");
            double miktar = scan.nextDouble();
            if (vadeli >= miktar) {
                paraCekVadeliden(miktar);
                System.out.println("Cektiginiz miktar: " + miktar);
                System.out.println("Vadeli hesap bakiyeniz: " + paraFormat.format(vadeli));
            } else {
                System.out.println("Bakiyeniz yetersizdir.");
            }
        }
        public void vadeliBakiyeParaYatirdiktanSonra() {
            System.out.println("Vadeli hesap bakiyeniz: " + paraFormat.format(vadeli));
            System.out.print("Lutfen yatirmak istediginiz miktari girin: ");
            double miktar = scan.nextDouble();
            paraYatirVadeliye(miktar);
            System.out.println("Vadeli hesap bakiyeniz: " + paraFormat.format(vadeli));
        }
    }

