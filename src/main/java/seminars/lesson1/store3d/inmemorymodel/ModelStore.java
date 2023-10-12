package seminars.lesson1.store3d.inmemorymodel;


import seminars.lesson1.store3d.modelelements.Camera;
import seminars.lesson1.store3d.modelelements.Flash;
import seminars.lesson1.store3d.modelelements.PoligonalModel;
import seminars.lesson1.store3d.modelelements.Scene;
import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements ModelChanger {
    //TODO: Доработать в рамках домашней работы

    public Scene getScena(int id) {
        for (Scene scene : scenes) {
            if (scene.getId() == id) {
                return scene;
            }
        }
        return null;
    }

    private Collection<PoligonalModel> poligonalModels = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();
    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    /**
     * Нотифицирует о событии
     */
    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : changeObservers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void registerModelChanger(ModelChangedObserver o) {

    }

    public void registerModelChanger(CustomService2 o) {
        changeObservers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }
}
