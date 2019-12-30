package homework4.garage_2.parts.api.lock;


import homework4.garage_2.parts.api.key.IKey;

public interface ILock {

    void open(IKey key);
    void close();
    boolean getLockCondition();
    String getSecret();
}
