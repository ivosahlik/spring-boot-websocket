package cz.ivosahlik.springbootwebsocket.model;


import cz.ivosahlik.springbootwebsocket.enumeration.MessageTypeEnum;
import lombok.Data;

@Data
public class ChatMessage {
    private String content;
    private String sender;
    private MessageTypeEnum type;
}
