package com.example.websocketdemo.model;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;
    private Long roomId;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
    // 열거형 : CHAT=0 JOIN=1 LEAVE=2

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
}