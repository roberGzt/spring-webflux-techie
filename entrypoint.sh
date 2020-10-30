#!/bin/sh -l

echo "Hello $1"
time=$(date)
echo "::set-output name=time::$time"
curl www.google.com