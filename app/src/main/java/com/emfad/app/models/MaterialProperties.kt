data class MaterialProperties(
    val name: String,
    val conductivity: Double, // S/m
    val permittivity: Complex,
    val permeability: Double,  // µr
    val density: Double,      // g/cm³
    val type: MaterialType,
    val color: Int,           // Hex-Farbwert
    val typicalDepth: Double,
    val typicalSize: Double
)

// Beispieldatenbank mit spezifischen Materialien
object MaterialDatabase {
    val materials = mapOf(
        "quartz_vein" to MaterialProperties(
            name = "Quarzader",
            conductivity = 1e-10,
            permittivity = Complex(4.5, 0.0),
            permeability = 1.0,
            density = 2.65,
            type = MaterialType.QUARTZ,
            color = 0xFFFFFFFF.toInt(),
            typicalDepth = 1.5,
            typicalSize = 0.8
        ),
        "pyrite_vein" to MaterialProperties(
            name = "Pyritader",
            conductivity = 1e4,
            permittivity = Complex(5.0, 0.0),
            permeability = 1.0,
            density = 5.0,
            type = MaterialType.NON_FERROUS_METAL,
            color = 0xFF0F52BA.toInt(),
            typicalDepth = 1.2,
            typicalSize = 0.7
        ),
        "tunnel" to MaterialProperties(
            name = "Tunnel",
            conductivity = 1e-12,
            permittivity = Complex(1.0, 0.0),
            permeability = 1.0,
            density = 0.0,
            type = MaterialType.CAVITY,
            color = 0xFF7F7F7F.toInt(),
            typicalDepth = 2.0,
            typicalSize = 1.0
        )
    )
}

