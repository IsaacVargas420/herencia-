/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente extends Cuenta {

    private double sobregiro;

    public CuentaCorriente(double sobregiro, double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, double comisionMensual) {
        super(saldo, numeroConsignaciones, numeroRetiros, tasaAnual, comisionMensual);
        this.sobregiro = sobregiro;

    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public void retiroCorriente(double valorRetiro) {
        if (valorRetiro > getSaldo()) {
            setSobregiro(valorRetiro - getSaldo());
            setSaldo(0);
            setNumeroRetiros(getNumeroRetiros()+1);
            System.out.println("Su saldo actual es 0 y el valor que adeuda como sobregiro al banco es:" + getSobregiro());
        } else {
            this.retiro(valorRetiro);
        }

    }

    public void depositoCorriente(double valorDepositar) {
        if (getSobregiro() > 0) {
            if (valorDepositar < getSaldo()) {
                setSobregiro(getSobregiro() - valorDepositar);
                setNumeroConsignaciones(getNumeroConsignaciones()+1);
                System.out.println("Usted está sobregirado por:"+getSobregiro());
            } else {
                double saldo = valorDepositar - getSobregiro();
                setSaldo(saldo);
                setNumeroConsignaciones(getNumeroConsignaciones()+1);
                setSobregiro(0);
                System.out.println("Usted ha cancelado el sobregiro, su saldo actual es:" + getSaldo());
            }
        } else {
            this.deposito(valorDepositar);
        }
    }

    public void imprimir() {
        System.out.println("DATOS CUENTA CORRIENTE\n"
                + "Saldo:" + getSaldo() + "\n"
                + "Sobregiro:" + getSobregiro() + "\n"
                + "Número de Depositos:" + getNumeroConsignaciones() + "\n"
                + "Número de Retiros:" + getNumeroRetiros() + "\n"
                + "Tasa Anual Interes:" + getTasaAnual() + "\n"
                + "Comisión Banco:" + getComisionMensual());

    }
}
