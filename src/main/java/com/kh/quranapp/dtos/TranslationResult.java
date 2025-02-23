package com.kh.quranapp.dtos;

import com.kh.quranapp.entity.EnSahih;
import com.kh.quranapp.entity.EnSarwar;
import com.kh.quranapp.entity.UrJalandhry;
import lombok.Data;

@Data
// TranslationResult.java
public class TranslationResult {
    private EnSahih sahih;
    private EnSarwar sarwar;
    private UrJalandhry jalandhry;

    public TranslationResult(EnSahih sahih, EnSarwar sarwar, UrJalandhry jalandhry) {
        this.sahih = sahih;
        this.sarwar = sarwar;
        this.jalandhry = jalandhry;
    }

    // Getters and setters
}
