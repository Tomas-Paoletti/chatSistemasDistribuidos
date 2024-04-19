package com.example.websockets.controller;


import com.example.websockets.model.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MensajeController {

        @MessageMapping("/envio")
        @SendTo("/tema/mensajes")
        public Mensaje envio(Mensaje  mensaje) {
                return new Mensaje(mensaje.nombre(), mensaje.contenido());
        }

}
