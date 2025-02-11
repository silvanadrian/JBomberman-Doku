package utils;

import network.NetworkFacade;
import action.ActionQueue;

public class ActionDispatcher implements Runnable {

	private ActionQueue queue;
	private NetworkFacade network;
	
	public ActionDispatcher(ActionQueue queue, NetworkFacade network) {
		this.queue = queue;
		this.network = network;
	}
	
	@Override
	public void run() {
		//get Action from network and put into queue
	}
}
