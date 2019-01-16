package fr.formation;

/**
 * Interface à implémenter, ne rien modifier dans cette interface.
 */
public interface IStudent {

    public String getName();

    public void setName(String firstName);

    public int getGroup();

    public void setGroup(int groupNumber);

    public boolean isInternal();

    public void setInternal(boolean internal);
}
