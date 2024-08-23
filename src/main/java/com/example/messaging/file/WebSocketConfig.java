package com.example.messaging.file; // Package pour les classes liées à la messagerie, ici on gère la config WebSocket.

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker // Active le support pour STOMP messages via WebSocket.
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // Configure le broker en mémoire pour les topics.
        config.enableSimpleBroker("/topic"); // Les clients s'abonneront ici pour recevoir des messages.

        // Préfixe pour les destinations côté application.
        config.setApplicationDestinationPrefixes("/app"); // Toutes les destinations côté serveur doivent commencer par "/app".
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // Enregistre l'endpoint WebSocket principal.
        registry.addEndpoint("/ws").withSockJS(); // "/ws" est l'endpoint pour établir la connexion WebSocket, avec fallback SockJS pour les navigateurs plus anciens.
    }
}
