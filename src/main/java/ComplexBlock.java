
import java.util.ArrayList;
import java.util.List;

public class ComplexBlock implements CompositeBlock {
private NormalBlock block;

    @Override
    public String getColor() {
        return this.block.getColor();
    }

    @Override
    public String getMaterial() {
        return this.block.getMaterial();
    }

    @Override
    public List<Block> getBlock() {
        List<Block> complexBlock = new ArrayList<>();
        complexBlock.add(new NormalBlock("brown","porotherm"));
        complexBlock.add(new NormalBlock("orange","airbrick"));
        complexBlock.add(new NormalBlock("brown","brick"));
        complexBlock.add(new NormalBlock("red","porotherm"));
        complexBlock.add(new NormalBlock("white","brick"));
        complexBlock.add(new NormalBlock("red","brick"));
        complexBlock.add(new NormalBlock("orange","brick"));
        complexBlock.add(new NormalBlock("white", "ceramic block"));
        complexBlock.add(new NormalBlock("orange","porotherm"));
        complexBlock.add(new NormalBlock("red","expanded clay"));
        return complexBlock;
    }

    @Override
    public String toString() {
        return "ComplexBlock{" +
                "block=" + block +
                '}';
    }
}
