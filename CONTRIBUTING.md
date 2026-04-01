# Welcome!
Thank you for contributing to Open Source projects! If you have any
questions or doubts, don't be afraid to send them our way. We appreciate all
contributions, and we are looking forward to fostering an open, transparent, and
collaborative environment.

Before contributing, we encourage you to also read our
[README](https://github.com/CDCgov/template/blob/master/README.md).

## Requesting Changes
Our pull request/merging process is designed to give Nava an opportunity to consider and discuss any suggested
changes.

### Open an issue in the repository
If you don't have specific language to submit but would like to suggest a change
or have something addressed, you can open an issue in this repository. Team
members will respond to the issue as soon as possible.

### Submit a pull request
If you would like to contribute, please submit a pull request. In order for us
to merge a pull request, it must:
   * Be at least seven days old. Pull requests may be held longer if necessary
     to give people the opportunity to assess it.
   * Receive a +1 from a majority of team members associated with the request.
     If there is significant dissent between the team, a meeting will be held to
     discuss a plan of action for the pull request.

## Versioning

This project uses [semantic versioning](https://semver.org/) (MAJOR.MINOR.PATCH).

**For most PRs**, you don't need to do anything special. When your PR is merged
to `main`, the patch version bumps automatically (e.g., 1.2.3 -> 1.2.4).

**For new features or breaking changes**, create a version tag on your branch
before opening your PR:

```bash
git tag v1.3.0
git push origin v1.3.0
```

When a version tag is present on your PR branch, the CI pipeline will:
- Use that version instead of the default patch bump
- Update the [CHANGELOG](CHANGELOG.md) automatically from your PR title and description

To help keep the changelog useful, please include the following in your PR
description when tagging a new version:
- A brief summary of what changed
- Any breaking changes (backwards-incompatible changes)
- Any new features added

That's it -- the pipeline handles the rest.
