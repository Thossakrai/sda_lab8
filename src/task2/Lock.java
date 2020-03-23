package task2;

public class Lock implements State {
    private RemoteDevice remote;

    public Lock(RemoteDevice remote) {
        this.remote = remote;
    }

    @Override
    public boolean pressPlay() {
        System.out.println("Cannot press while lock");
        return false;
    }

    @Override
    public boolean pressPause() {
        System.out.println("Cannot press while lock");
        return false;
    }

    @Override
    public boolean pressStop() {
        System.out.println("Cannot press while lock");
        return false;
    }

    @Override
    public boolean pressRewind() {
        System.out.println("Cannot press while lock");
        return false;
    }

    @Override
    public boolean remoteLock() {
        System.out.println("The remote is already lock");
        return false;
    }

    @Override
    public boolean remoteUnlock() {
        System.out.println("The remote is unlocked!");
        remote.setState(remote.saveState);
        return true;
    }
}
