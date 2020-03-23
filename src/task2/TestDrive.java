package task2;
public class TestDrive {
	public static void main(String[] args) {
		
		// what about a singleton here???
//		RemoteDeviceV1 remote = new RemoteDeviceV1();
		RemoteDevice remote = new RemoteDevice();
		
		remote.pressPlay();
		remote.pressLock();
		remote.pressUnlock();
		remote.pressStop();
//		remote.pressPause();
//
//		remote.pressStop();
//
//		remote.pressPlay();
//		remote.pressPlay();
//		remote.pressStop();
//		remote.pressRewind();

	}

}
