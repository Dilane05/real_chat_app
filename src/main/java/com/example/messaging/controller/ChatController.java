package com.example.messaging.controller;

import com.example.messaging.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller // Indique que cette classe est un contrôleur Spring, gérant les requêtes.
public class ChatController {

    @MessageMapping("/chat.sendMessage")
    // Associe cette méthode à la destination "/chat.sendMessage" côté serveur.
    // Lorsqu'un client envoie un message à "/app/chat.sendMessage", cette méthode est invoquée.

    @SendTo("/topic/public")
    // Indique que le retour de cette méthode sera envoyé à tous les abonnés du topic "/topic/public".

    public ChatMessage sendMessage(ChatMessage chatMessage) {
        // Simplement retourne le message reçu, qui sera ensuite broadcasté à tous les abonnés du topic "/topic/public".
        return chatMessage;
    }
}
