public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло"), POLYETILEN("Полиэтилен"),PAPERCUP("бумажный стакан");

    private final String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
