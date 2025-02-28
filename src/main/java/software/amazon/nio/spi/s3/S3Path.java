/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */

package software.amazon.nio.spi.s3;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public interface S3Path extends Path {

    @Override
    S3FileSystem getFileSystem();

    @Override
    S3Path toAbsolutePath();

    @Override
    S3Path resolve(String other);

    @Override
    S3Path resolveSibling(Path other);

    @Override
    S3Path resolveSibling(String other);

    @Override
    S3Path getRoot();

    @Override
    S3Path getFileName();

    @Override
    S3Path getParent();

    @Override
    S3Path getName(int index);

    @Override
    S3Path subpath(int beginIndex, int endIndex);

    @Override
    S3Path resolve(Path other);

    @Override
    S3Path normalize();

    @Override
    S3Path relativize(Path other);

    @Override
    S3Path toRealPath(LinkOption... options) throws IOException;
}
