
import java.util.List;


import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure{
    ComplexBlock block = new ComplexBlock();

    private List<Block> blocks = block.getBlock();
    @Override
    public Optional<Block> findBlockByColor(String color) {
        Optional<Block> currentColor = blocks.stream()
                .filter(colorFound -> colorFound.getColor().toLowerCase().equals(color.toLowerCase()))
                .findAny();
        currentColor.ifPresentOrElse(colorFound->System.out.println("Block found by color: "
                + color + " : " + currentColor),()->System.out.println("block with this color not exist"));
        return currentColor;
    }

    @Override
    public List<Block> findBlockByMaterial(String material) {
            List<Block> currentMaterial = blocks.stream()
                    .filter(materialFound -> materialFound.getMaterial().toLowerCase().equals(material.toLowerCase()))
                    .collect(Collectors.toList());
            System.out.println("Block found by material: " + material);
            currentMaterial.forEach(materialFound -> System.out.println(materialFound));
            return currentMaterial;

    }

    @Override
    public int count() {
        System.out.println("the list of blocks size is: " + blocks.size());
        return blocks.size();
    }

    public static void main(String[] args) {
        Wall wall =  new Wall();
        wall.findBlockByMaterial("brick");
        System.out.println("==========================");
        wall.findBlockByColor("white");
        System.out.println("==========================");
        wall.count();
        System.out.println("==========================");
        wall.findBlockByMaterial("wood");
        System.out.println("==========================");
        wall.findBlockByColor("pink");
        System.out.println("==========================");
    }

}
