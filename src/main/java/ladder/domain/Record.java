package ladder.domain;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

class Record {
    private List<Integer> indices;

    Record(List<Integer> indices) {
        this.indices = indices;
    }

    List<Integer> getIndices() {
        return Collections.unmodifiableList(indices);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(indices, record.indices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indices);
    }
}
