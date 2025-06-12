
enum class MeasurementMode(val config: ModeConfiguration) {
    BA_VERTICAL(ModeConfiguration(
        validFrequencyRange = 10.0..10000.0,
        requiresVerticalAntenna = true,
        usesDipole = true,
        minDepthResolution = 0.1,
        maxDepth = 5.0
    )),
    AB_HORIZONTAL(ModeConfiguration(
        validFrequencyRange = 100.0..50000.0,
        requiresVerticalAntenna = false,
        usesDipole = true,
        minDepthResolution = 0.2,
        maxDepth = 3.0
    )),
    ANTENNA_A(ModeConfiguration(
        validFrequencyRange = 1000.0..100000.0,
        requiresVerticalAntenna = true,
        usesDipole = false,
        minDepthResolution = 0.05,
        maxDepth = 1.0
    )),
    DEPTH_PRO(ModeConfiguration(
        validFrequencyRange = 10.0..50000.0,
        requiresVerticalAntenna = true,
        usesDipole = true,
        minDepthResolution = 0.01,
        maxDepth = 10.0
    ));

    data class ModeConfiguration(
        val validFrequencyRange: ClosedRange<Double>,
        val requiresVerticalAntenna: Boolean,
        val usesDipole: Boolean,
        val minDepthResolution: Double,
        val maxDepth: Double
    )
}

