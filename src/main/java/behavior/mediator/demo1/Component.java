package behavior.mediator.demo1;

abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(){
        mediator.componentChanged(this);
    }

    public abstract void update();
}
