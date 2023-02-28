package kolokwium2.StrukturyB;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSet {
    private TreeSet<Integer> treeSet;

    public TreeSetSet() {treeSet = new TreeSet<Integer>();}
    public TreeSet<Integer> getTreeSet(){return treeSet;}

    public Integer size() {return treeSet.size();}
    public boolean member(Integer elem) {return treeSet.contains(elem);}
    public void insert(Integer elem){if(!member(elem)) treeSet.add(elem);}
    public boolean delete(Integer elem){
        if(member(elem)){
            treeSet.remove(elem);
            return true;
        } else return false;
    }

    public void print()
    {
        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next().intValue());
    }

    public TreeSetSet union(TreeSetSet secondSet)
    {
        TreeSetSet unionSet = new TreeSetSet();

        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()) unionSet.insert(iterator.next().intValue());

        Iterator<Integer> iteratorS = secondSet.getTreeSet().iterator();
        while(iterator.hasNext()) unionSet.insert(iterator.next().intValue());

        return unionSet;
    }

    public TreeSetSet intersection(TreeSetSet secondSet)
    {
        TreeSetSet intersectionSet = new TreeSetSet();

        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            int local = iterator.next().intValue();
            if(secondSet.member(local))intersectionSet.insert(local);
        }
        return intersectionSet;
    }

    public TreeSetSet diff(TreeSetSet secondSet)
    {
        TreeSetSet diffSet = new TreeSetSet();

        Iterator<Integer> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            int local = iterator.next().intValue();
            if(!secondSet.member(local))diffSet.insert(local);
        }
        return diffSet;
    }


    public static void main(String[] args) {
        TreeSetSet setA = new TreeSetSet();
        setA.insert(10);
        setA.insert(20);
        setA.insert(30);

        setA.print();

        TreeSetSet setB = new TreeSetSet();
        setB.insert(10);
        setB.insert(50);
        setB.insert(60);

        setB.print();

        System.out.println();

        TreeSetSet unionSet = setA.union(setB);
        unionSet.print();

        System.out.println();

        TreeSetSet interSet = setA.intersection(setB);
        interSet.print();

        System.out.println();

        TreeSetSet difSet = setA.diff(setB);
        difSet.print();
    }
}
