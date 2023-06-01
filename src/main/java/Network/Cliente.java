/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author PICHAU
 */
public class Cliente {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public Cliente(String endereco, int porta) throws IOException {
        socket = new Socket(endereco, porta);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public String enviarMensagem(String mensagem) throws IOException {
        out.println(mensagem);
        return in.readLine();
    }

    public void desconectar() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}