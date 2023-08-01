package banco;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private LocalDate aniversario;

    public ContaPoupanca(int numero, int dataAbertura, double saldo, double tarifa, LocalDate aniversario) {
        super(numero, dataAbertura, saldo, tarifa);
        this.aniversario = aniversario;
    }
    @Override
    public double calcularTarifa(){
        return tarifa;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    
}
