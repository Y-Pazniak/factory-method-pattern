package org.example.components;

public class ComponentsStorage {
    private ComponentsStorage() {
    }

    public static ComponentsStorage getInstance() {
        return PartsStorageHolder.PARTS_STORAGE;
    }

    public Body getDefaultBody() {
        return new Body(true, 0, true);
    }

    public Fur getDefaultFur() {
        return new Fur("Bald");
    }

    public Tail getDefaultTail() {
        return new Tail(0);
    }

    private static class PartsStorageHolder {
        private static final ComponentsStorage PARTS_STORAGE = new ComponentsStorage();
    }
}
