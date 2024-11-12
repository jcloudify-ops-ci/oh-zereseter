package com.jcloudify.zereseter.file.hash;

import com.jcloudify.zereseter.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
