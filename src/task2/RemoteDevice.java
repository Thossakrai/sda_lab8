/**
 * RemoteDevice.java
 * <p>
 * This is the device that we are controlling with the
 * State pattern.
 */
package task2;

public class RemoteDevice {
    // the different states the device may be in
    private State playing;
    private State paused;
    private State stopped;
    private State rewind;
    private State lock;
    private State unlock;

    //the current state of the player
    private State currentState;
    //TODO public to private
    public State saveState;

    /**
     * the current position of the media
     * this may be 0 (the beginning of the media)
     * up to some int value representing  the end of the media
     */
    private int currentPosition;

    // initialize the remote device
    public RemoteDevice() {
        playing = new Playing(this);
        paused = new Paused(this);
        stopped = new Stopped(this);
        rewind = new Rewind(this);
        lock = new Lock(this);

        // initial state is stopped
        currentState = stopped;

        // we are at the beginning of the media
        currentPosition = 0;
    }

    // set the state of the device
    public void setState(State currentState) {
        this.currentState = currentState;
    }

    // set the position of the media
    public void setPosition(int position) {
        currentPosition = position;
    }

    // get the current position of the media
    public int getPosition() {
        return currentPosition;
    }

    // press the Play button
    public void pressPlay() {
        currentState.pressPlay();
    }

    // press the Pause button
    public void pressPause() {
        currentState.pressPause();
    }

    // press the Stop button
    public void pressStop() {
        currentState.pressStop();
    }

    //press the Rewind Button
    public void pressRewind() { currentState.pressRewind(); }

	public void pressLock() {
    	saveState = currentState;
    	currentState.remoteLock(); }
	public void pressUnlock() { currentState.remoteUnlock(); }

    // return the playing state
    public State getPlayingState() {
        return playing;
    }

    // return the paused state
    public State getPausedState() {
        return paused;
    }

    // return the stopped state
    public State getStoppedState() {
        return stopped;
    }

    // return the rewind state
	public State getRewindState() { return rewind; }

	// return the lock state
	public State getLockState() { return lock; }

	// return the unlock state
	public State getUnlockState() { return unlock; }

}
