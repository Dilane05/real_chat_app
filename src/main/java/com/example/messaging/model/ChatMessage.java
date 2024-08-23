package com.example.messaging.model;

// Classe représentant un message de chat
public class ChatMessage {

    // Contenu du message de chat
    private String content;

    // Expéditeur du message de chat
    private String sender;

    // Constructeur par défaut
    public ChatMessage() {
    }

    // Constructeur avec paramètres pour initialiser le message
    public ChatMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    // Getter pour obtenir le contenu du message
    public String getContent() {
        return content;
    }

    // Setter pour définir le contenu du message
    public void setContent(String content) {
        this.content = content;
    }

    // Getter pour obtenir l'expéditeur du message
    public String getSender() {
        return sender;
    }

    // Setter pour définir l'expéditeur du message
    public void setSender(String sender) {
        this.sender = sender;
    }

    // Méthode toString pour une représentation textuelle du message
    @Override
    public String toString() {
        return "ChatMessage{" +
                "content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }

    // Méthode equals pour comparer deux messages de chat
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChatMessage that = (ChatMessage) o;

        if (!content.equals(that.content)) return false;
        return sender.equals(that.sender);
    }

    // Méthode hashCode pour obtenir un code de hachage pour le message
    @Override
    public int hashCode() {
        int result = content.hashCode();
        result = 31 * result + sender.hashCode();
        return result;
    }
}
