package bytes.recebidos;

import BancoDeDados.BancoLooca;
import org.example.Console;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BytesDAOVm {
    public void cadastroDeDados(BytesRecebidos bytesRecebidos, Console console){
        String sql = "INSERT INTO inovacaoEduardoMeloDeOliveira (bytesRecebidos,monitor) values (?,?)";

        try(PreparedStatement ps = BancoLooca.getbancoLooca().prepareStatement(sql)){
            ps.setLong(1, bytesRecebidos.getBytesRecebidos());
            ps.setInt(2, console.getIdMonitoramento());
            ps.execute();

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
