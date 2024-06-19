package bytes.recebidos;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.rede.RedeInterface;
import org.example.Console;

import java.util.List;

public class BytesRecebidosEduardoMeloDeOliveira {

    public static void coletaDeBytes(Console console) {

        Looca looca = new Looca();

        List<RedeInterface> listRedes = looca.getRede().getGrupoDeInterfaces().getInterfaces();



        for(RedeInterface dadoDaVez : listRedes ){
            long bytesRecebidos = dadoDaVez.getBytesRecebidos();

            BytesRecebidos bytesR = new BytesRecebidos();

            bytesR.setBytesRecebidos(bytesRecebidos);
            new BytesRecebidosDAO().cadastroDeDados(bytesR, console);
        }

    }
}
