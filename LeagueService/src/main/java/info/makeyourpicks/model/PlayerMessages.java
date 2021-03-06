package info.makeyourpicks.model;

import com.delesio.model.AbstractPersistantObject;
import com.delesio.model.IPersistable;

public class PlayerMessages extends AbstractPersistantObject {

	private boolean read=false;
	private MessageBoard message;
	private Player player;
	
	public PlayerMessages()
	{
		
	}
	
	public PlayerMessages(Player player, MessageBoard messageBoard)
	{
		this.player = player;
		this.message = messageBoard;
	}
	
	@Override
	public IPersistable createTestObject() {
		return new PlayerMessages();
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public MessageBoard getMessage() {
		return message;
	}

	public void setMessage(MessageBoard message) {
		this.message = message;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
