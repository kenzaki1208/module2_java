package week9.structural_design_pattern.exercise.ex3.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{
    private CollectionUtils collectionUtils;

    public CollectionUtilsAdapter() {
        this.collectionUtils = new CollectionUtils();
    }

    @Override
    public int findMax(Set<Integer> numbers) {
        //chuyển đổi từ Set<Integer> sang List<Integer>
        List<Integer> list = new ArrayList<>(numbers);

        return collectionUtils.findMax(list);
    }
}
