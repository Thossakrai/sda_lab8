/**
 * Playing.java
 * <p>
 * This file represents the Playing state
 */
package task2;

public class Playing implements State {
    private RemoteDevice remote;

    public Playing(RemoteDevice remote) {
        this.remote = remote;
    }

    // the Play button is pressed
    public boolean pressPlay() {
        System.out.println("The player is already playing.");

        return false;
    }

    // the Pause button is pressed
    public boolean pressPause() {
        System.out.println("The player is paused.");
        remote.setState(remote.getPausedState());

        return true;
    }

    // the Stop button is pressed
    public boolean pressStop() {
        System.out.println("The player is stopped.");
        remote.setState(remote.getStoppedState());
        remote.setPosition(0);

        return true;
    }

    public boolean pressRewind() {
        System.out.println("Cannot rewind while It's in playing mode");
        return false;
    }

    @Override
    public boolean remoteLock() {
        System.out.println("Remote Lock");
        remote.setState(remote.getLockState());
        remote.setPosition(0);
        return true;
    }

    @Override
    public boolean remoteUnlock() {
        return false;
    }

}
