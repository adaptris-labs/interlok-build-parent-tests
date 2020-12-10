package com.adaptris.labs;

import org.junit.runner.RunWith;
import org.gradle.samples.test.runner.GradleSamplesRunner;
import org.gradle.samples.test.runner.SamplesRoot;
import org.gradle.samples.test.runner.SamplesOutputNormalizers;
import org.gradle.samples.test.normalizer.FileSeparatorOutputNormalizer;
import org.gradle.samples.test.normalizer.GradleOutputNormalizer;
import org.gradle.samples.test.normalizer.JavaObjectSerializationOutputNormalizer;

@RunWith(GradleSamplesRunner.class)
@SamplesRoot("src/test/samples")
@SamplesOutputNormalizers({GradleOutputNormalizer.class})
public class BuildParentIntegrationTest {
}