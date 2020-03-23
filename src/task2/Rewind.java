package task2;

public class Rewind implements State {
    private RemoteDevice remote;

    public Rewind(RemoteDevice remote) {
        this.remote = remote;
    }

    public boolean pressPlay() {
        System.out.println("Cannot play while It's in rewind mode");
        return false;
    }

    public boolean pressPause() {
        System.out.println("Cannot pause while It's in rewind mode");
        return false;
    }

    public boolean pressStop() {
        System.out.println("Cannot stop while It's in rewind mode");
        return false;
    }

    public boolean pressRewind() {
        System.out.println("Already rewind");
        return false;
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
