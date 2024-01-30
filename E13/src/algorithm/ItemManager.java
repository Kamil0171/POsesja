package algorithm;

import java.util.ArrayList;
import java.util.List;

public class ItemManager <T>
{
    private List<T> lista;

    public ItemManager(List<T> lista) {
        this.lista = lista;
    }

    public List<T> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "ItemManager{" +
                "lista=" + lista +
                '}';
    }

    public void addItem(T item)
    {
        lista.add(item);
    }

    public T getItem(int index)
    {
        return lista.get(index);
    }

    public int getItemCount()
    {
        return lista.size();
    }

    public static void main(String[] args) {
        List<ItemManager> lista = new ArrayList<>();

    }
}
