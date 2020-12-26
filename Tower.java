public interface Tower {
	private Flyable[] observers;

	void register(Flyable flyable);
	void unregister(Flyable flyable);
	protected void conditionsChanged();
}