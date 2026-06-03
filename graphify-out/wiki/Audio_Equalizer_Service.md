# Audio Equalizer Service

> 47 nodes · cohesion 0.06

## Key Concepts

- **ParametricEQParser** (10 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQParser.kt`
- **EqualizerService** (10 connections) — `app/src/main/kotlin/com/music/vivi/eq/EqualizerService.kt`
- **AxionEqViewModel** (9 connections) — `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`
- **EQProfileRepository** (9 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/EQProfileRepository.kt`
- **.applyToService()** (6 connections) — `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`
- **.parseFilterLine()** (5 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQParser.kt`
- **.parseText()** (5 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQParser.kt`
- **SavedEQProfile** (4 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/EQProfileRepository.kt`
- **ParametricEQBand** (4 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQ.kt`
- **.applyProfileToProcessor()** (4 connections) — `app/src/main/kotlin/com/music/vivi/eq/EqualizerService.kt`
- **.saveCustomProfile()** (3 connections) — `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`
- **.setBandsGains()** (3 connections) — `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`
- **.importCustomProfile()** (3 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/EQProfileRepository.kt`
- **ParametricEQ** (3 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQ.kt`
- **.addAudioProcessor()** (3 connections) — `app/src/main/kotlin/com/music/vivi/eq/EqualizerService.kt`
- **EQProfileRepository.kt** (2 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/EQProfileRepository.kt`
- **ParametricEQ.kt** (2 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQ.kt`
- **EqualizerService.kt** (2 connections) — `app/src/main/kotlin/com/music/vivi/eq/EqualizerService.kt`
- **.reset()** (2 connections) — `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`
- **.setBandGain()** (2 connections) — `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`
- **.setEnabled()** (2 connections) — `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`
- **.saveProfile()** (2 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/EQProfileRepository.kt`
- **.parseFile()** (2 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQParser.kt`
- **.parseFilterType()** (2 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQParser.kt`
- **.parsePreamp()** (2 connections) — `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQParser.kt`
- *... and 22 more nodes in this community*

## Relationships

- No strong cross-community connections detected

## Source Files

- `app/src/main/kotlin/com/music/vivi/eq/EqualizerService.kt`
- `app/src/main/kotlin/com/music/vivi/eq/data/EQProfileRepository.kt`
- `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQ.kt`
- `app/src/main/kotlin/com/music/vivi/eq/data/ParametricEQParser.kt`
- `app/src/main/kotlin/com/music/vivi/ui/screens/equalizer/axion/AxionEqViewModel.kt`

## Audit Trail

- EXTRACTED: 116 (89%)
- INFERRED: 14 (11%)
- AMBIGUOUS: 0 (0%)

---

*Part of the graphify knowledge wiki. See [[index]] to navigate.*