/**
 * Stopped.java
 * <p>
 * This file represents the Stopped state.
 */
package task2;

public class Stopped implements State {
    private RemoteDevice remote;

    public Stopped(RemoteDevice remote) {
        this.remote = remote;
    }

    // the Play button is pressed
    public boolean pressPlay() {
        System.out.println("The player is now playing.");
        remote.setState(remote.getPlayingState());
        remote.setPosition(remote.getPosition() + 1);

        return true;
    }

    // the Paused button is pressed
    public boolean pressPause() {
        System.out.println("The player is now paused.");
        remote.setState(remote.getPausedState());

        return true;
    }

    // the  Stop button is pressed
    public boolean pressStop() {
        System.out.println("The player is already stopped.");
        return false;
    }

    // the Rewind button is pressed
    public boolean pressRewind() {
        System.out.println("The player is now rewind");
        remote.setState(remote.getRewindState());
        remote.setPosition(0);

        return true;
    }

    @Override
    public boolean remoteLock() {
        System.out.println("Remote Lock");
        remote.setState(remote.getLockState());
        remote.setPosition(0);
        return false;
    }

    @Override
    public boolean remoteUnlock() {
        return false;
    }


}
