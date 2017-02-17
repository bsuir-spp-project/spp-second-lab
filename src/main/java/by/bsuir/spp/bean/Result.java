package by.bsuir.spp.bean;

import java.util.ArrayList;

public class Result {


    private ArrayList elements = new ArrayList();

    public ArrayList getElements() {
        return elements;
    }

    public void setElements(ArrayList elements) {
        this.elements = elements;
    }

    public void addElement(Object element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n{\n");

        for (int i = 0; i < elements.size(); i++) {
            stringBuilder.append("\t");
            stringBuilder.append(elements.get(i).toString());

            if (i + 1 < elements.size()) {
                stringBuilder.append(",\n");
            }
        }
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }

}
